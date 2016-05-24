Intent sendTextIntent = new Intent();
sendTextIntent.setAction(Intent.ACTION_SEND);
sendTextIntent.putExtra(Intent.EXTRA_TEXT, poem);
sendTextIntent.setType("text/plain");
startActivity(sendTextIntent);
