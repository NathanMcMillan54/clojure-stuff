# Imports

To import another file in the project, use the ``require`` function.

```clojure
(require 'project_name.file '[project_name.file :as file])
```

To call a function:
```clojure
(file/function_from_other_file)
```
