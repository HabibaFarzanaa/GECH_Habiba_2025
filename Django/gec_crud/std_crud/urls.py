from django.urls import path
from . import views
urlpatterns = [
    path("", views.home ,name="home"),
    path("about", views.about),
    path("content", views.content),
    path("edit/<int:id>", views.edit_student, name="edit"),
    path("delete/<int:id>", views.delete_student, name="delete"),
]