# Contributing Guidelines

Thank you for considering contributing to the DSA_questions repository! Your contributions are highly valued. Before you start contributing, please take a moment to read these guidelines to ensure a smooth and collaborative experience.

## Getting Started
- An active GitHub account.
- Git installed on your local machine. Setting it up.
- Familarize yourself with git basic commands.

## Contributing Process

Here's a step-by-step guide on how to contribute to this repository:

### Creating a New Branch

1. Fork the repository to your GitHub account. You can find on top of the [repo](./).
2. Clone your forked repository to your local machine:

```bash
git clone https://github.com/your-username/DSA_questions.git
```

3. Create a new branch for your changes:

```bash
git checkout -b your-branch-name
```

### Adding Solutions

1. Navigate to the relevant problem category folder, e.g., [**cpp**](/problems/cpp/), etc.
2. Create a new folder with the problem's name if it doesn't already exist.
3. Inside the problem's folder, create two files:
   - **problem.md**: A description of the problem statement.
   - **solution.cpp** (or other language extensions): Your solution to the problem in a commented code.

> Note: If a solution to a problem for a language already exists and you have a different approach you can add `solution2.cpp` and create PR.

## Pull Request Guidelines

When you're ready to contribute your changes, follow these steps:

- Commit your changes and push them to your forked repository:

```bash
git add .
git commit -m "Your commit message"
git push origin your-branch-name
```

- Create a pull request (PR) from your branch to the main repository. Provide a clear title and/or description for your PR, detailing the changes you made.
- Your PR will be reviewed by the repository maintainer. If any changes or improvements are needed, feedback will be provided.
- Once your PR is approved, it will be merged into the main repository. Congratulations, you've successfully contributed! 🥳

> Note: To create multiple PRs to repositories you will need to create different branches. So if you want to create another PR: 
```bash
git checkout main
git checkout -b your-branch-name2
```

