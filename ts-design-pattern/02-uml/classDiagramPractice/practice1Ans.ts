//演習1　答え

class Employee {
    private id: number
    private name: string
    private salary: number

    work(): void {
        console.log("働きます")
    }

    protected getSalary(): number {
        return this.salary
    }

    protected setSalary(salary: number): void {
        this.salary += salary
    }
}