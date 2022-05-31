@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
String ac = e.getActionCommand();
if(opCount == 0) {
tDisplay.setText("");
}
tDisplay.append(ac);
if(ac.equals("=")) {
opCount = 0;
if(operator == 1) {
//addition operation
result = op1 + op2;
tDisplay.append(Integer.toString(result));
}
else if(operator == 1) {
//Add codes for the subtraction 
operation
}
// Add "else if" code blocks to include 
support for division (operator = 3),
// and multiplication (operator = 4)
}
else if(ac.equals("+")) {
operator = 1;
}
// Add "else if" code blocks to include support for 
subtraction (operator = 2),
// division (operator = 3), and multiplication (operator 
= 4)
else {
int value = Integer.valueOf(ac);
if(opCount < 1) {
op1 = value;
opCount = 1;
}
else if(opCount >= 1) {
op2 = value;
opCount = 2;
}
}
}