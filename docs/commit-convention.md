# Commit Convention Reference

This course follows the **Conventional Commits** standard.
Full spec: https://www.conventionalcommits.org

## Format

```
<type>: <short description>
```

## Types

| Type | Use case | Example |
|------|----------|---------|
| `feat:` | New feature or file | `feat: add domain data classes for music app` |
| `fix:` | Bug fix / NPE fix | `fix: resolve NPE in findUserById null return` |
| `docs:` | README, comments | `docs: update Day 2 section in README` |
| `refactor:` | Restructure, no behavior change | `refactor: extract printInfo into helper function` |
| `test:` | Adding tests | `test: add unit test for GradeManager` |

## Rules

- ✅ Keep the description **short** (under 72 characters)
- ✅ Use **imperative mood**: "add", "fix", "update" — not "added", "fixed"
- ✅ One logical change per commit (**atomic commits**)
- ❌ Never: `git commit -m "stuff"` or `git commit -m "done"`

## Day 2 Example — Atomic Commit Sequence

```
fix: resolve NPE in findUserById null return
fix: resolve NPE in getServerPort env variable
fix: resolve NPE in getHorsepower chained access
fix: resolve NPE in getFirstAdmin list access
fix: resolve NPE in formatProduct anti-patterns
feat: add domain data classes for [your project name]
```
