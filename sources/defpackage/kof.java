package defpackage;

import java.io.File;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: kof  reason: default package */
/* loaded from: classes.dex */
public final class kof {
    public final koh a;
    public final Object b = new Object();
    public final String c;
    public final Locale d;
    public final String e;
    public final ncx f;
    public mko g;

    public kof(koh kohVar, String str, Locale locale, ncx ncxVar) {
        this.a = kohVar;
        this.c = str;
        this.d = locale;
        this.f = ncxVar;
        this.e = kfl.g(str, locale, ncxVar);
    }

    public final mko a() {
        synchronized (this.b) {
            mko mkoVar = this.g;
            if (mkoVar != null) {
                return mkoVar;
            }
            mko g = mio.g(mhu.h(((knn) this.a).a.hQ(new jiz(this, 12)), Throwable.class, new miy() { // from class: koe
                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:43:0x01a5
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
                    */
                @Override // defpackage.miy
                public final defpackage.mko a(java.lang.Object r19) {
                    /*
                        Method dump skipped, instructions count: 495
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.koe.a(java.lang.Object):mko");
                }
            }, ((knn) this.a).a), new knm(2), ((knn) this.a).a);
            this.g = g;
            kcu.U(g, new hyw(this, 14), ((knn) this.a).a);
            return g;
        }
    }

    public final File b() {
        return new File(this.a.e(), kfl.f(this.e));
    }

    public final void c() {
        synchronized (this.b) {
            mko mkoVar = this.g;
            if (mkoVar != null) {
                mkoVar.cancel(false);
                this.g = null;
            }
        }
    }
}
