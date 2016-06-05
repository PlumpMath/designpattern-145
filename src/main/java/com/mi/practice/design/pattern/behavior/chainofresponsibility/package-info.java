/**
 * Created by michelle on 16-6-5.
 * <p/>
 * <li>
 *     Avoid coupling the sender of a request to its receiver by giving more than one object a
 *     chance to handle the request. Chain the receiving objects and pass the request along the
 *     chain until an object handles it.
 * </li>
 * <li>
 * Launch-and-leave requests with a single processing pipeline that contains many possible handlers.
 * </li>
 * <li> An object-oriented linked list with recursive traversal. </li>
 *
 * <pre>
 (Client) --&lt;request> ------------------------------->
 * <br>         |          |             |            |
 * <br>         |  [Processing element]  |  [Processing element]
 * <br>  [Processing element]    [Processing element]
 * </pre>
 *
 * The chaining mechanism uses recursive composition to allow an unlimited number of handlers to be
 linked.
 Chain of Responsibility simplifies object interconnections. Instead of senders and receivers
 maintaining references to all candidate receivers, each sender keeps a single reference to the head
 of the chain, and each receiver keeps a single reference to its immediate successor in the chain.
 <p/>
 <b>Do not use Chain of Responsibility when each request is only handled by one handler, or, when
 the client object knows which service object should handle the request.</b>

 <p>
 The derived classes know how to satisfy Client requests. If the "current" object is not available
 or sufficient, then it delegates to the base class, which delegates to the "next" object, and the
 circle of life continues.
 </p>
 <p>
 --- Check list:
 <pre>
 1.The base class maintains a "next" pointer.
 2.Each derived class implements its contribution for handling the request.
 3.If the request needs to be "passed on", then the derived class "calls back" to the base class, which delegates to the "next" pointer.
 4.The client (or some third party) creates and links the chain (which may include a link from the last node to the root node).
 5.The client "launches and leaves" each request with the root of the chain.
 6.Recursive delegation produces the illusion of magic.
 </pre>
 */
package com.mi.practice.design.pattern.behavior.chainofresponsibility;