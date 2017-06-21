//#include "stdafx.h"
#include "MyForm.h"
using namespace System;
using namespace System::Windows::Forms;

[STAThread]
int main(array<System::String ^> ^args)
{
	Application::EnableVisualStyles();
	Application::SetCompatibleTextRenderingDefault(false);
	Przegladarka::MyForm form;
	Application::Run(%form);
	return 0;
}