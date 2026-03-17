# Android Kotlin Foundation — Phase 1

**STEP IT Academy · Android Mobile Application Development**
Phase 1 of 4 · Days 1–6 · Kotlin Foundation

---

## ▶ How to Open & Run in IntelliJ IDEA

1. Click **Use this template** on GitHub → Create your own repo
2. Clone your repo: `git clone <your-repo-url>`
3. Open IntelliJ IDEA → **File → Open** → select the cloned folder
4. Wait for Gradle sync to finish (bottom status bar)
5. Navigate to any `.kt` file under `src/main/kotlin/`
6. Click the **▶ green arrow** next to `fun main()` to run it

> **First run takes ~1 min** — Gradle downloads Kotlin & dependencies once.
> All subsequent runs are instant.

---

## 📁 Project Structure

```
kotlin-foundation/
├── src/main/kotlin/
│   ├── day1/   Main.kt                        ← Hello World
│   ├── day2/   Snippet1–5.kt, PersonalProject.kt
│   ├── day3/   NumberGame.kt, BusinessLogic.kt
│   ├── day4/   DomainModels.kt
│   ├── day5/   StudentList.kt
│   └── day6/   GradeManager.kt               ← Mini Project 1 ⭐
├── docs/
│   ├── commit-convention.md
│   └── diagrams/                              ← your diagram files go here
├── build.gradle.kts                           ← Kotlin + Coroutines config
└── settings.gradle.kts
```

---

## 🌿 Branch Convention

Never commit directly to `main`. Always create a branch first:

```bash
git checkout -b day{N}/{topic}
# Examples:
git checkout -b day1/setup
git checkout -b day2/null-safety
git checkout -b day3/control-flow
```

---

## ✍️ Commit Convention

| Prefix | When to use | Example |
|--------|-------------|---------|
| `feat:` | New code | `feat: implement number guessing game` |
| `fix:` | Bug / NPE fix | `fix: resolve NPE in findUserById` |
| `docs:` | README / comments | `docs: add class diagram` |
| `refactor:` | Restructure | `refactor: extract printInfo helper` |

See [`docs/commit-convention.md`](docs/commit-convention.md) for full reference.

---

## 📋 Progress Tracker

- [ ] Day 1 — Environment Setup & Hello World
- [ ] Day 2 — Null Safety
- [ ] Day 3 — Control Flow & Functions
- [ ] Day 4 — OOP & Class Diagram
- [ ] Day 5 — Collections & Lambdas
- [ ] Day 6 — Mini Project 1 ⭐

---

## 🔀 Phase 2 Onwards

From **Day 7**, you will switch to a separate **GitHub Classroom** repo for all graded assignments. Your instructor will share the link on Day 7.

---

*STEP IT Academy · Instructor Magn · Confidential — Not for Distribution*
