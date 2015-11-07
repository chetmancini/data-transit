from transit.reader import Reader

reader = Reader("json")
with open("resources/transit_data.json", "r") as io:
    val = reader.read(io)
    print val