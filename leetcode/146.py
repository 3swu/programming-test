class LRUCache:

    def __init__(self, capacity: int):
        self.use_list, self.dict, self.capacity = [], {}, capacity
        self.size = 0


    def get(self, key: int) -> int:
        if key in self.dict.keys():
            self.update_list(key)
            return self.dict[key]
        return -1

    def put(self, key: int, value: int) -> None:
        if key in self.dict.keys():
            self.dict[key] = value
            self.update_list(key)
        else:
            if self.size < self.capacity:
                self.dict[key] = value
                self.update_list(key)
                self.size += 1
            else:
                del(self.dict[self.use_list[0]])
                self.dict[key] = value
                self.update_list((self.use_list[0], key))

    def update_list(self, key):
        if isinstance(key, tuple):
            self.use_list.remove(key[0])
            self.use_list.append(key[1])
        else:
            if key in self.use_list:
                self.use_list.remove(key)
                self.use_list.append(key)
            else:
                self.use_list.append(key)

if __name__ == '__main__':
    cache = LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    print(cache.get(1))
    cache.put(3, 3)
    print(cache.get(2))
    cache.put(4, 4)
    print(cache.get(1))
    print(cache.get(3))
    print(cache.get(4))