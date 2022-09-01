package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* renamed from: oqc  reason: default package */
/* loaded from: classes2.dex */
public final class oqc {
    public opr a;
    public Proxy b;
    final List c;
    final List d;
    public final List e;
    public final List f;
    ProxySelector g;
    public opq h;
    public opc i;
    public SocketFactory j;
    public SSLSocketFactory k;
    public oty l;
    public HostnameVerifier m;
    final opi n;
    final oow o;
    final oow p;
    final opk q;
    final opt r;
    public boolean s;
    public boolean t;
    int u;
    int v;
    int w;
    public opu x;

    public oqc() {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = new opr();
        this.c = oqd.a;
        this.d = oqd.b;
        this.x = opv.c(opv.b);
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.g = proxySelector;
        if (proxySelector == null) {
            this.g = new otv();
        }
        this.h = opq.a;
        this.j = SocketFactory.getDefault();
        this.m = otz.a;
        this.n = opi.a;
        oow oowVar = oow.a;
        this.o = oowVar;
        this.p = oowVar;
        this.q = new opk();
        this.r = opt.a;
        this.s = true;
        this.t = true;
        this.u = 10000;
        this.v = 10000;
        this.w = 10000;
    }

    public final oqd a() {
        return new oqd(this);
    }

    public final void b(long j, TimeUnit timeUnit) {
        this.u = oqs.A(j, timeUnit);
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.v = oqs.A(j, timeUnit);
    }

    public final void d(long j, TimeUnit timeUnit) {
        this.w = oqs.A(j, timeUnit);
    }

    public oqc(oqd oqdVar) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.a = oqdVar.c;
        this.b = oqdVar.d;
        this.c = oqdVar.e;
        this.d = oqdVar.f;
        arrayList.addAll(oqdVar.g);
        arrayList2.addAll(oqdVar.h);
        this.x = oqdVar.z;
        this.g = oqdVar.i;
        this.h = oqdVar.j;
        this.i = oqdVar.k;
        this.j = oqdVar.l;
        this.k = oqdVar.m;
        this.l = oqdVar.n;
        this.m = oqdVar.o;
        this.n = oqdVar.p;
        this.o = oqdVar.q;
        this.p = oqdVar.r;
        this.q = oqdVar.s;
        this.r = oqdVar.t;
        this.s = oqdVar.u;
        this.t = oqdVar.v;
        this.u = oqdVar.w;
        this.v = oqdVar.x;
        this.w = oqdVar.y;
    }
}
