Design Capabilities – Part 3

This document presents two system design exercises:

A simple REST API for a Library System

Class design for an Orders + Payments System

1. Library REST API – Overview
Main Endpoints
Method	Path	Purpose
GET /books	List books (filter + pagination)	
GET /books/{id}	Get book by id	
POST /books	Create a new book	
PUT /books/{id}	Update book	
DELETE /books/{id}	Remove book	
POST /users	Register a user	
GET /users/{id}	Get user & loan history	
POST /loans	Borrow a book	
PUT /loans/{id}/return	Return borrowed book	
DTO Structure (required fields only)

BookDTO: title, author, isbn, copies

UserDTO: name, email

LoanDTO: userId, bookId

Features: Validation, clear status codes, separation of Controllers → Services → Repositories, with DTO exposure (not entities).

2. Orders + Payments System Design
Core Classes
Component	Responsibility
Order	Stores order data (amount, status, createdAt)
OrderItem	Stores product, quantity, unitPrice
Payment	Records payment attempt + transactionId
OrderService	Order logic, validation, status updates
PaymentService	Executes payment + updates order status
PaymentGatewayClient	External payment provider interface
Enums

OrderStatus: NEW / PAID / CANCELLED …

PaymentStatus: PENDING / SUCCESS / FAILED …
