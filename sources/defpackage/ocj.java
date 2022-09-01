package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: ocj  reason: default package */
/* loaded from: classes2.dex */
public final class ocj extends nug {
    public oda c;
    public oda d;
    final nvb e;
    nut f;
    final String g;
    public String h;
    final String i;
    public nsy j;
    public nsk k;
    public long l;
    public boolean m;
    final ntj n;
    public boolean o;
    public boolean p;
    public final ocf q;
    private final List v;
    private final ocg w;
    private static final Logger r = Logger.getLogger(ocj.class.getName());
    static final long a = TimeUnit.MINUTES.toMillis(30);
    public static final long b = TimeUnit.SECONDS.toMillis(1);
    private static final oda s = off.c(oao.o);
    private static final nsy t = nsy.b;
    private static final nsk u = nsk.a;

    public ocj(String str, ocg ocgVar, ocf ocfVar) {
        oda odaVar = s;
        this.c = odaVar;
        this.d = odaVar;
        this.v = new ArrayList();
        nvb a2 = nvb.a();
        this.e = a2;
        this.f = a2.a;
        this.i = "pick_first";
        this.j = t;
        this.k = u;
        this.l = a;
        this.m = true;
        this.n = ntj.b;
        this.o = true;
        this.p = true;
        jdg.Q(str, "target");
        this.g = str;
        this.w = ocgVar;
        this.q = ocfVar;
    }

    static String a(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", "/" + socketAddress, null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public final void b(List list) {
        this.v.addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.nug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.nuf c() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocj.c():nuf");
    }

    public ocj(SocketAddress socketAddress, String str, ocg ocgVar) {
        oda odaVar = s;
        this.c = odaVar;
        this.d = odaVar;
        this.v = new ArrayList();
        nvb a2 = nvb.a();
        this.e = a2;
        this.f = a2.a;
        this.i = "pick_first";
        this.j = t;
        this.k = u;
        this.l = a;
        this.m = true;
        this.n = ntj.b;
        this.o = true;
        this.p = true;
        this.g = a(socketAddress);
        this.w = ocgVar;
        this.f = new oci(socketAddress, str);
        this.q = new ofy(1);
    }
}
