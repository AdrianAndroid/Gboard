package defpackage;

/* compiled from: PG */
/* renamed from: oam  reason: default package */
/* loaded from: classes2.dex */
public enum oam {
    NO_ERROR(0, nvu.l),
    PROTOCOL_ERROR(1, nvu.k),
    INTERNAL_ERROR(2, nvu.k),
    FLOW_CONTROL_ERROR(3, nvu.k),
    SETTINGS_TIMEOUT(4, nvu.k),
    STREAM_CLOSED(5, nvu.k),
    FRAME_SIZE_ERROR(6, nvu.k),
    REFUSED_STREAM(7, nvu.l),
    CANCEL(8, nvu.c),
    COMPRESSION_ERROR(9, nvu.k),
    CONNECT_ERROR(10, nvu.k),
    ENHANCE_YOUR_CALM(11, nvu.i.f("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, nvu.g.f("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, nvu.d);
    
    public static final oam[] o;
    public final nvu p;
    private final int r;

    static {
        oam[] values = values();
        oam[] oamVarArr = new oam[((int) values[values.length - 1].a()) + 1];
        for (oam oamVar : values) {
            oamVarArr[(int) oamVar.a()] = oamVar;
        }
        o = oamVarArr;
    }

    oam(int i, nvu nvuVar) {
        this.r = i;
        String concat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (nvuVar.p != null) {
            concat = concat + " (" + nvuVar.p + ")";
        }
        this.p = nvuVar.f(concat);
    }

    public final long a() {
        return this.r;
    }
}
