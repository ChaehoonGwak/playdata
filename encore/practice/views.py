from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.

def TellHello(request):
    html = "<h1> 우리들의 첫번째 장고 App입니다.    <h1>"
    return HttpResponse(html)