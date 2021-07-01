# 재료선택
# 시간복잡도는 정렬을 사용하기 때문에 O(NlogN)이 된다.
def second_largest_number(arr):
    unique_nums = set(arr)
    sorted_nums = sorted(unique_nums, reverse=True)
    return sorted_nums[1]


beef1, beef2, beef3 = map(int, input().split())

arr = [beef1, beef2, beef3]


print(second_largest_number(arr))
