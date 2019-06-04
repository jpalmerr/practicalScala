# Exceptions

Exceptions are not a good idea because ...

- They aren't functional
- They propagate up the call stack
- They force handling within a thread

Very much a side effect rather than expressed in the return value

How about handing the exception back?
  - treat exceptions much more like values/objects
  - allow caller to decide how to handl the exception



