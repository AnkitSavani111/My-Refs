select p.firstName, p.lastName, a.city, a.state from person as p left join on address as a where p.personId = a.personId;

-- select e.name as Employee from employee as e left join employee as f on e.id = f.managerId where e.
select e.name as Employee from employee as e inner join employee as f on e.id = f.managerId where e.salary > f.salary;

# Write your MySQL query statement below
SELECT e.name AS Employee FROM Employee AS e INNER JOIN Employee AS f ON e.managerId = f.id WHERE e.salary > f.salary;

select customers.name as Customers from customers left join orders on customers.id = orders.customerId where orders.customerId is null;