

RefactoringAgileArchitectureAboutThoughtworks
Agile Software Guide
In the last decade agile software development has moved from being a cult technique to an increasing part of the mainstream. I was lucky enough to be at the beginning of this story, with early experiences on the 'birth project' of Extreme Programming and a co-author of the Manifesto for Agile Software Development. Thoughtworks started using agile techniques in 2000 and we've since successfully used them on our projects world-wide. We've learned a huge amount about using agile methods in enterprise settings and are committed to sharing this learning to help foster their intelligent adoption.

A guide to material on martinfowler.com about agile software development.

Martin Fowler
1 Aug 2019

The Essence of Agile Software Development
It's been over a decade since the developers of agile methods first started to talk about their approaches. In this time agile thinking has changed from a niche activity to an approach that is widely used. However, like any popular technique, agile software development has suffered from semantic diffusion, so much of what we see under the name of agile doesn't bear much resemblance to what the early pioneers were doing. So I think it's important to revisit the essential elements of agile thinking.

I've always seen the essence of agile thinking resting on two contrasts with traditional plan-driven software engineering:

Agile Development

is adaptive rather than predictive
is people-oriented rather than process-oriented
Plan-driven engineering expects us to come up with a predictive plan that precedes development. The plan lays out the people, resources and timelines for the overall project. Software design is also done up-front, with implementation expected to conform with this design. Success is measured according to how well development follows this plan.

Agile plans are a baseline that we use to help us control changes. Agile teams plan just as carefully as traditional teams, but the plans are constantly revising to reflect the things we learn during a project. Success is based on value delivered by the software.

Plan-driven engineering seeks a process which provides enough structure to reduce individual variations to insignificance. Such an industrial process is more predictable, copes better when people transfer, and is easier to define skills and career paths.

Agile engineering sees software development as a primarily human activity, where the people involved and how they bond as a team are the primary driver behind success. Processes (and tools) can enhance a team's effectiveness, but are always second-order influences.

The New Methodology


After my positive experiences with Extreme Programming in the 90s, I became curious about similar sounding approaches such as Scrum, Crystal, and DSDM. Digging into them, I distilled the common characteristics of these new methodologies: preferring adaptive planning to predictive planning, and treating people as more important to success than what process was used. In time these approaches gathered under the banner of agile software development, (and I revised the article) but I still find the perspective in this article a good way to understand the essence of agility.

by Martin Fowler

13 Dec 2005

Read more…

ARTICLE

AGILE PROCESS THEORY

Manifesto for Agile Software Development


It may not have started it all, but the manifesto gave the movement a name together with a dollop of initial energy. A decade later it still captures the essence of what agile methods are about.

by 17 authors

Read more…

AGILE

Talk: Agile Essence and Fluency


It's been over a decade since we wrote the Manifesto for Agile Software Development, and the agile meme has been more successful than we ever could have hoped for. But like any success, there is the regular danger of Semantic Diffusion. I try to combat this disease by describing the essence of agile software development: preferring adaptive planning to predictive planning and favoring people over process.

I then describe the Agile Fluency model, which I find an effective way to think about how agile teams become proficient, and the steps you typically go through as you become a more skillful user of agile techniques.

2019

More…

VIDEO

24 minutes



Agile methods are solidly in the mainstream, but that popularity hasn't been without its problems. Organizational leaders are complaining that they’re not getting the benefits they expected. This article presents a fluency model that will help you get the most out of agile ideas. Fluency evolves through four distinct zones, each with its own benefits, required proficiencies, and key metrics.

by James Shore and Diana Larsen

6 Mar 2018

Read more…

ARTICLE

AGILE PROCESS THEORY

Technical Practices
To make agile work, you need solid technical practices. A lot of agile education under-emphasizes these, but if you skimp on this you won't gain the productivity and responsiveness benefits that agile development can give you (stranding you in the first zone of agile fluency). This is one of the reasons that I still think that Extreme Programming is the most valuable of the named agile methods as a core and starting point.

Refactoring Guide


Refactoring is a disciplined technique for restructuring an existing body of code, altering its internal structure without changing its external behavior. Its heart is a series of small behavior preserving transformations. Each transformation (called a "refactoring") does little, but a sequence of these transformations can produce a significant restructuring. Since each refactoring is small, it's less likely to go wrong. The system is kept fully working after each refactoring, reducing the chances that a system can get seriously broken during the restructuring.

by Martin Fowler

Read more…

GUIDE

PROGRAMMING STYLE EXTREME PROGRAMMING REFACTORING

Is High Quality Software Worth the Cost?


A common debate in software development projects is between spending time on improving the quality of the software versus concentrating on releasing more valuable features. Usually the pressure to deliver functionality dominates the discussion, leading many developers to complain that they don't have time to work on architecture and code quality. This debate is based on the assumption that increasing quality also increases costs, which is our common experience. But the counter-intuitive reality is that internal software quality removes the cruft that slows down developing new features, thus decreasing the cost of enhancing the software.

by Martin Fowler

29 May 2019

Read more…

ARTICLE

PROGRAMMING STYLE PRODUCTIVITY PROJECT PLANNING TECHNICAL DEBT

Continuous Delivery Guide
It’s hard enough for software developers to write code that works on their machine. But even when that’s done, there’s a long journey from there to software that’s producing value - since software only produces value when it’s in production. he essence of my philosophy to software delivery is to build software so that it is always in a state where it could be put into production. We call this Continuous Delivery because we are continuously running a deployment pipeline that tests if this software is in a state to be delivered.

by Martin Fowler

Read more…

GUIDE

CONTINUOUS DELIVERY

Self Testing Code


Self-Testing Code is the name I used in Refactoring to refer to the practice of writing comprehensive automated tests in conjunction with the functional software. When done well this allows you to invoke a single command that executes the tests - and you are confident that these tests will illuminate any bugs hiding in your code.

by Martin Fowler

1 May 2014

Read more…

BLIKI

AGILE CONTINUOUS DELIVERY TESTING EXTREME PROGRAMMING PROGRAMMING STYLE REFACTORING

Is Design Dead?


For many that come briefly into contact with Extreme Programming, it seems that XP calls for the death of software design. Not just is much design activity ridiculed as "Big Up Front Design", but such design techniques as the UML, flexible frameworks, and even patterns are de-emphasized or downright ignored. In fact XP involves a lot of design, but does it in a different way than established software processes. XP has rejuvenated the notion of evolutionary design with practices that allow evolution to become a viable design strategy. It also provides new challenges and skills as designers need to learn how to do a simple design, how to use refactoring to keep a design clean, and how to use patterns in an evolutionary style.

by Martin Fowler

May 2004

Read more…

ARTICLE

POPULAR DESIGN AGILE EXTREME PROGRAMMING EVOLUTIONARY DESIGN

Code As Documentation


One of the common elements of agile methods is that they raise programming to a central role in software development - one much greater than the software engineering community usually does. Part of this is classifying the code as a major, if not the primary documentation of a software system.

by Martin Fowler

22 Mar 2005

Read more…

BLIKI

AGILE DOCUMENTATION

Collaboration
Improving human collaboration is at the heart of agile thinking. Communication and feedback are two of the stated values of Extreme Programming, and agilists look to find ways to maximise these as part of their projects

It's Not Just Standing Up: Patterns for Daily Standup Meetings


Daily stand-up meetings have become a common ritual of many teams, especially in Agile software development. However, there are many subtle details that distinguish effective stand-ups and a waste of time.

by Jason Yip

21 Feb 2016

Read more…

ARTICLE

AGILE

On Pair Programming


Many people who work in software development today have heard of the practice of pair programming, yet it still only has patchy adoption in the industry. One reason for its varying acceptance is that its benefits are not immediately obvious, it pays off more in the medium- and long-term. And it's also not as simple as "two people working at a single computer", so many dismiss it quickly when it feels uncomfortable. However, in our experience, pair programming is vital for collaborative teamwork and high quality software.

by Birgitta Böckeler and Nina Siessegger

15 Jan 2020

Read more…

ARTICLE

EXTREME PROGRAMMING COLLABORATION

User Story


User Stories are chunks of desired behavior of a software system. They are widely used in agile software approaches to divide up a large amount of functionality into smaller pieces for planning purposes. You also hear the same concept referred to as a feature, but the term "story" or "user story" has become prevalent in agile circles these days.

by Martin Fowler

22 Apr 2013

Read more…

BLIKI

AGILE REQUIREMENTS ANALYSIS

Conversational Stories


Here's a common misconception about agile methods. It centers on the way user stories are created and flow through the development activity. The misconception is that the product owner (or business analysts) creates user stories and then put them in front of developers to implement. The notion is that this is a flow from product owner to development, with the product owner responsible for determining what needs to be done and the developers how to do it.

by Martin Fowler

4 Feb 2010

Read more…

BLIKI

AGILE EXTREME PROGRAMMING REQUIREMENTS ANALYSIS COLLABORATION

Frequency Reduces Difficulty


One of my favorite soundbites is: if it hurts, do it more often. It has the happy property of seeming nonsensical on the surface, but yielding some valuable meaning when you dig deeper

by Martin Fowler

28 Jul 2011

Read more…

BLIKI

AGILE CONTINUOUS DELIVERY PRODUCTIVITY PROCESS THEORY

An Appropriate Use of Metrics


Management love their metrics. The thinking goes something like this, "We need a number to measure how we’re doing. Numbers focus people and help us measure success." Whilst well intentioned, management by numbers unintuitively leads to problematic behavior and ultimately detracts from broader project and organizational goals. Metrics inherently aren’t a bad thing; just often, inappropriately used. This essay demonstrates many of the issues caused by management’s traditional use of metrics and offers an alternative to address these dysfunctions.

Patrick Kua

19 Feb 2013

Read more…

ARTICLE

METRICS PRODUCTIVITY PROJECT PLANNING TECHNICAL LEADERSHIP

Remote versus Co-located Work


There isn't a simple dichotomy of remote versus co-located work, instead there are several patterns of distribution for teams each of which has different trade-offs and effective techniques suitable for them. While it's impossible to determine conclusive evidence, my sense is that most groups are more productive working in a co-located manner. But you can build a more productive team by using a distributed working model, because it gives you access to a wider talent pool.

by Martin Fowler

19 Oct 2015

Read more…

ARTICLE

AGILE PRODUCTIVITY TEAM ENVIRONMENT TEAM ORGANIZATION COLLABORATION COVID-19

Using an Agile Software Process with Offshore Development


For the last four years Thoughtworks has operated a lab in Bangalore India to support our software development projects in North America and Europe. Traditional approaches to offshore development are based on plan-driven methodologies, but we are very firmly in the agile camp. Here I discuss our experiences and lessons learned in doing offshore agile development. So far we've discovered that we can make it work, although the benefits are still open to debate. (Although this article was last updated in 2006, I our visited our offshore work in 2011 and found the lessons to still be relevant and thus the article did not need a further significant revision.)

by Martin Fowler

18 Jul 2006

Read more…

ARTICLE

AGILE

Customer Affinity


When someone is looking at what makes up a top-class enterprise software developer, often the conversation may turn to knowledge of frameworks and languages, or perhaps the ability to understand complicated algorithms and data structures. For me, one of the most important traits in a programmer, or indeed in a development team, is something that I'll call Customer Affinity. This is the interest and closeness that the developers have in the business problem that the software is addressing, and in the people who live in that business world.

by Martin Fowler

28 Jul 2006

Read more…

BLIKI

AGILE TEAM ORGANIZATION REQUIREMENTS ANALYSIS

Outcome Oriented


People who sponsor development of software usually aren’t very interested in development metrics such as velocity or frequency of deployment to production. They care more about business benefits that the software will deliver such as lower manual effort, better sales conversion, greater customer satisfaction, i.e business outcomes. Outcome-oriented teams are those that are mandated and equipped to deliver business outcomes, such teams have people with the capability to carry out all necessary activities to realize the outcome.. By contrast, ActivityOriented teams are neither equipped nor mandated to do so. They can only perform one of several activities required to realize an outcome.

by Sriram Narayan

1 Jun 2016

Read more…

BLIKI

AGILE ADOPTION TEAM ORGANIZATION

Problems
While the agile mindset can help many teams deliver software more effectively, the world of agile software is far from free of problems. As with any popular approach semantic diffusion has set in, resulting in many things being done in the name of "agile" that have little to do with the ideas that motivated us to write the manifesto.

The State of Agile Software in 2018


On the surface, the world of agile software development is bright, since it is now mainstream. But the reality is troubling, because much of what is done is faux-agile, disregarding agile's values and principles. The three main challenges we should focus on are: fighting the Agile Industrial Complex and its habit of imposing process upon teams, raising the importance of technical excellence, and organizing our teams around products (rather than projects). Despite the problems, the community's great strength is its ability to learn and adapt, tackling problems that we original manifesto authors didn't imagine.

by Martin Fowler

25 Aug 2018

Read more…

ARTICLE

AGILE TALK VIDEOS

Semantic Diffusion


I have the habit of creating Neologisms to describe the things I see in software development. It's a common habit amongst writers in this field, for software development still lacks much useful jargon. One of the problems with building a jargon is that terms are vulnerable to losing their meaning, in a process of semantic diffusion - to use yet another potential addition to our jargon.

by Martin Fowler

14 Dec 2006

Read more…

BLIKI

AGILE ADOPTION DICTIONARY BAD THINGS WRITING

Agile Imposition


According to the current board of the Agile Alliance, agile methods have "crossed the chasm" , which I think means they are becoming more widespread. While this has its advantages, it also brings problems. As a methodology or design approach becomes fashionable, then we see a lot people using it, or teaching it, who are focusing on the fashion rather than the real details. This can lead to reports of things done in agile's name which are a polar opposite to the principles of movement's founders.

by Martin Fowler

2 Oct 2006

Read more…

BLIKI

AGILE AGILE ADOPTION

Flaccid Scrum


There's a mess I've heard about with quite a few projects recently. It works out like this:

They want to use an agile process, and pick Scrum
They adopt the Scrum practices, and maybe even the principles
After a while progress is slow because the code base is a mess
by Martin Fowler

29 Jan 2009

Read more…

BLIKI

AGILE AGILE ADOPTION BAD THINGS

Feature Devotion


A common, perhaps dominant, practice of agile methods is to develop a list of features (often called stories) for the software that's being built. These features are tracked with index cards, work queues, burndown charts, backlogs, or whatever your tool of choice is.

by Martin Fowler

2 Nov 2006

Read more…

BLIKI

AGILE BAD THINGS REQUIREMENTS ANALYSIS PROCESS THEORY


© Martin Fowler | Privacy Policy | Disclosures