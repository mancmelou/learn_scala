Chapter 3: Working with arrays
==============================

Some key points:
- Use an `Array` if the length is fixed. Use an `ArrayBuffer` if the length can vary.
- Do not use `new` when creating an initial collection.
- Use `()` to access elements.
- Use `for (elem <- array)` to traverse the elements of a collection.
- Use `for (elem <- array if ...) ... yield ...` to transform into a new array.

Fixed length arrays
-------------------
