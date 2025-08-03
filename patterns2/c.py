# n = int(input("Enter number of rows: "))
# mid = (n + 1) // 2  # Ensure middle includes the actual center row for odd n

# # Upper half including the middle line
# for i in range(1, mid + 1):
#     # Left numbers
#     for j in range(1, i + 1):
#         print(j, end="")

#     # Spaces
#     spaces = (mid - i) * 2
#     if spaces > 0:
#         print(" " * spaces, end="")

#     # Right numbers
#     for j in range(i, 0, -1):
#         if i != mid or spaces > 0:  # Skip repeating middle if no space
#             print(10 - j, end="")

#     print()

# # Lower half (reverse of upper, excluding middle)
# for i in range(mid - 1, 0, -1):
#     # Left numbers
#     for j in range(1, i + 1):
#         print(j, end="")

#     # Spaces
#     spaces = (mid - i) * 2
#     if spaces > 0:
#         print(" " * spaces, end="")

#     # Right numbers
#     for j in range(i, 0, -1):
#         print(10 - j, end="")

#     print()




a=int(input())
for i in range(a):
    if 