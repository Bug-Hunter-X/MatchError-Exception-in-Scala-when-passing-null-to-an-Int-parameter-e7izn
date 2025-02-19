# MatchError Exception in Scala
This repository demonstrates a common error in Scala: a `MatchError` exception that occurs when passing `null` to a method expecting an `Int` type.

## The Problem
Scala's `Int` type is a primitive type and cannot be `null`.  When a method expects an `Int` and receives `null`, Scala's type system cannot handle this and throws a `MatchError`.  This is different from languages like Java where `Integer` is a wrapper class allowing `null` values.

## The Solution
To avoid this issue, you should use an `Option[Int]` instead of a plain `Int`. `Option[Int]` can either hold an `Int` value or be `None`, representing the absence of a value. This enables handling null cases explicitly, improving code robustness and preventing unexpected exceptions.
