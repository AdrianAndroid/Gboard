package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkv  reason: default package */
/* loaded from: classes.dex */
public final class jkv {
    public static volatile boolean a = false;
    public final Context b;
    public final jkk c;
    public final jkl d;
    public final jli e;
    public final jlk f;
    public final lfb g;
    public final Executor h;
    public final lfb i;
    public final jhy j;
    public final jml k;
    public final jmi l;
    public final jma m;

    public jkv(Context context, jli jliVar, jlk jlkVar, jkk jkkVar, jkl jklVar, jmi jmiVar, jma jmaVar, lfb lfbVar, Executor executor, lfb lfbVar2, jhy jhyVar, jml jmlVar, byte[] bArr) {
        this.b = context;
        this.e = jliVar;
        this.f = jlkVar;
        this.c = jkkVar;
        this.d = jklVar;
        this.l = jmiVar;
        this.m = jmaVar;
        this.g = lfbVar;
        this.h = executor;
        this.i = lfbVar2;
        this.j = jhyVar;
        this.k = jmlVar;
    }

    public final mko a() {
        return jco.j(this.e.b(), new jku(this, 1), this.h);
    }

    public final mko b(boolean z, miy miyVar) {
        int i = jmk.a;
        return jco.j(c(), new jkh(this, z, miyVar, 3), this.h);
    }

    public final mko c() {
        return a ? mkk.a : jnd.c(mkk.a).g(new jke(this, 14), this.h).g(new jke(this, 16), this.h).g(new jke(this, 20), this.h).g(new jku(this, 3), this.h).e(jkc.h, this.h);
    }
}
