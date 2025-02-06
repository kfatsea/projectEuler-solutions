# Project Euler Commit Guide  
*Multi-Language Pattern Tracking*

## Commit Structure  
```
<type>(problem-<ID>/<lang>): <imperative verb> [pattern: <Pattern>]
```

## Commit Types  
| Type       | Use Case                                | Example Scope         |  
|------------|-----------------------------------------|-----------------------|  
| `feat`     | New problem/pattern implementation      | `problem-001/rust`    |  
| `fix`      | Bug correction                          | `problem-002/java`    |  
| `docs`     | Documentation updates                   | `problem-000/project` |  
| `refactor` | Code improvement                        | `problem-005/haskell` |  
| `test`     | Add/update tests                        | `problem-014/python`  |  
| `perf`     | Performance optimization                | `problem-031/clojure` |  

## Key Examples

### New Pattern Implementation  
```
feat(problem-001/rust): implement strategy pattern via traits [pattern: Strategy]
- Created SortStrategy trait
- Added QuickSort/MergeSort implementations
- Benchmark shows 15% speedup vs Python
```

### Documentation Update  
```
docs(problem-000/project): add pattern comparison matrix [pattern: N/A]
- Strategy vs Iterator performance metrics
- Cross-language trait/interface examples
```

### Bug Fix  
```
fix(problem-002/java): correct Fibonacci iterator index [pattern: Iterator]
- Adjust initial sequence values
- Add edge case test for n=0
```

### Performance Optimization  
```
perf(problem-031/clojure): optimize DP with transient! [pattern: Dynamic Programming]
- Replace atom with transient mutable state
- 40% faster on 10k coin combinations
```

## Rules  
1. **Problem Format**: Use 3-digit IDs (`problem-001`)  
2. **Language Tags**: `python` | `java` | `rust` | `haskell` | `clojure` | `cpp`  
3. **Pattern Reference**: Use standard GOF names in brackets  
4. **Line Limits**:  
   - Subject line ≤ 50 characters  
   - Body lines ≤ 72 characters  

## Automation Tools  
```
# Install commit helper
npm install -g commitizen

# Husky config (.husky/commit-msg):
#!/bin/sh
. "$(dirname "$0")/_/husky.sh"
npx commitlint --edit "$1"
```


