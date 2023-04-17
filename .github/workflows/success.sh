#!/bin/bash

morning_dance() {
  art_path=`find ~ -name "morning.art"`
  cat $art_path
}

afternoon_dance() {
  echo '   _O/                   '
  echo '     \                  /           \O_'
  echo '     /\_              \_\         /\/'
  echo '     \                   \         /'
  echo '             O/ /       /O\        \'
  echo '             /\|/\                 '
}

evening_dance() {
  echo '    ♪┏(・o･)┛♪┗ ( ･o･) ┓♪'
  echo
  echo '  ᕕ(⌐■_■)ᕗ ♪♬'
  echo
  echo '♪┏(・o･)┛♪┗ ( ･o･) ┓♪'
  echo
}

midnight_dance() {
  art_path=`find ~ -name "sleep.art"`
  cat $art_path
}

# https://stackoverflow.com/questions/14346342/greet-a-user-differently-on-the-time-of-day-bash-script
h=`TZ=US/Pacific date +%H`
if [ $h -le 12 ] && [ $h -gt 5 ] ; then
  morning_dance 
elif [ $h -le 18 ] && [ $h -gt 12 ]; then
  afternoon_dance
elif [ $h -lt 23 ] && [ $h -gt 18 ]; then
  evening_dance 
else
  midnight_dance
fi
