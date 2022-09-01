package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* renamed from: gbi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gbi implements Closeable {
    public final /* synthetic */ gbj a;
    public final /* synthetic */ String b;
    public final /* synthetic */ mfx c;
    public final /* synthetic */ long d;

    public /* synthetic */ gbi(gbj gbjVar, String str, mfx mfxVar, long j) {
        this.a = gbjVar;
        this.b = str;
        this.c = mfxVar;
        this.d = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gbj gbjVar = this.a;
        String str = this.b;
        mfx mfxVar = this.c;
        gbjVar.l(str, mfxVar == null ? null : mfxVar.q(), gbjVar.b.b() - this.d);
    }
}
