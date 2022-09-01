package defpackage;

/* compiled from: PG */
/* renamed from: nik  reason: default package */
/* loaded from: classes2.dex */
public enum nik {
    DOUBLE(nil.DOUBLE, 1),
    FLOAT(nil.FLOAT, 5),
    INT64(nil.LONG, 0),
    UINT64(nil.LONG, 0),
    INT32(nil.INT, 0),
    FIXED64(nil.LONG, 1),
    FIXED32(nil.INT, 5),
    BOOL(nil.BOOLEAN, 0),
    STRING(nil.STRING, 2),
    GROUP(nil.MESSAGE, 3),
    MESSAGE(nil.MESSAGE, 2),
    BYTES(nil.BYTE_STRING, 2),
    UINT32(nil.INT, 0),
    ENUM(nil.ENUM, 0),
    SFIXED32(nil.INT, 5),
    SFIXED64(nil.LONG, 1),
    SINT32(nil.INT, 0),
    SINT64(nil.LONG, 0);
    
    public final nil s;
    public final int t;

    nik(nil nilVar, int i) {
        this.s = nilVar;
        this.t = i;
    }
}
