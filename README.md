# Kotlin Set Modification: Unexpected `removeIf` and `removeAll` Behavior

This repository demonstrates an unexpected behavior of the `removeIf` and `removeAll` functions when used with `MutableSet` in Kotlin.  While these functions work as expected with `MutableList`, their in-place modification of sets can be surprising.

The `bug.kt` file shows the issue.  The solution (`bugSolution.kt`) provides alternatives to ensure predictable behavior.

**Issue:**
When used with a `MutableSet`, `removeIf` and `removeAll` directly modify the original set, which can lead to unintended side-effects if you are expecting a new set to be returned.

**Solution:**
Using a different approach that creates a new set prevents modifying the original set unexpectedly. See `bugSolution.kt` for examples.
