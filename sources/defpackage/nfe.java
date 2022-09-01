package defpackage;

/* compiled from: PG */
/* renamed from: nfe  reason: default package */
/* loaded from: classes2.dex */
public enum nfe {
    DOUBLE(0, 1, ngf.DOUBLE),
    FLOAT(1, 1, ngf.FLOAT),
    INT64(2, 1, ngf.LONG),
    UINT64(3, 1, ngf.LONG),
    INT32(4, 1, ngf.INT),
    FIXED64(5, 1, ngf.LONG),
    FIXED32(6, 1, ngf.INT),
    BOOL(7, 1, ngf.BOOLEAN),
    STRING(8, 1, ngf.STRING),
    MESSAGE(9, 1, ngf.MESSAGE),
    BYTES(10, 1, ngf.BYTE_STRING),
    UINT32(11, 1, ngf.INT),
    ENUM(12, 1, ngf.ENUM),
    SFIXED32(13, 1, ngf.INT),
    SFIXED64(14, 1, ngf.LONG),
    SINT32(15, 1, ngf.INT),
    SINT64(16, 1, ngf.LONG),
    GROUP(17, 1, ngf.MESSAGE),
    DOUBLE_LIST(18, 2, ngf.DOUBLE),
    FLOAT_LIST(19, 2, ngf.FLOAT),
    INT64_LIST(20, 2, ngf.LONG),
    UINT64_LIST(21, 2, ngf.LONG),
    INT32_LIST(22, 2, ngf.INT),
    FIXED64_LIST(23, 2, ngf.LONG),
    FIXED32_LIST(24, 2, ngf.INT),
    BOOL_LIST(25, 2, ngf.BOOLEAN),
    STRING_LIST(26, 2, ngf.STRING),
    MESSAGE_LIST(27, 2, ngf.MESSAGE),
    BYTES_LIST(28, 2, ngf.BYTE_STRING),
    UINT32_LIST(29, 2, ngf.INT),
    ENUM_LIST(30, 2, ngf.ENUM),
    SFIXED32_LIST(31, 2, ngf.INT),
    SFIXED64_LIST(32, 2, ngf.LONG),
    SINT32_LIST(33, 2, ngf.INT),
    SINT64_LIST(34, 2, ngf.LONG),
    DOUBLE_LIST_PACKED(35, 3, ngf.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, ngf.FLOAT),
    INT64_LIST_PACKED(37, 3, ngf.LONG),
    UINT64_LIST_PACKED(38, 3, ngf.LONG),
    INT32_LIST_PACKED(39, 3, ngf.INT),
    FIXED64_LIST_PACKED(40, 3, ngf.LONG),
    FIXED32_LIST_PACKED(41, 3, ngf.INT),
    BOOL_LIST_PACKED(42, 3, ngf.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, ngf.INT),
    ENUM_LIST_PACKED(44, 3, ngf.ENUM),
    SFIXED32_LIST_PACKED(45, 3, ngf.INT),
    SFIXED64_LIST_PACKED(46, 3, ngf.LONG),
    SINT32_LIST_PACKED(47, 3, ngf.INT),
    SINT64_LIST_PACKED(48, 3, ngf.LONG),
    GROUP_LIST(49, 2, ngf.MESSAGE),
    MAP(50, 4, ngf.VOID);
    
    private static final nfe[] aa;
    public final int Z;

    static {
        nfe[] values = values();
        aa = new nfe[values.length];
        for (nfe nfeVar : values) {
            aa[nfeVar.Z] = nfeVar;
        }
    }

    nfe(int i, int i2, ngf ngfVar) {
        this.Z = i;
        ngf ngfVar2 = ngf.VOID;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = ngfVar.k;
        }
        if (i2 == 1) {
            ngfVar.ordinal();
        }
    }
}
