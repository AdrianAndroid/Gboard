package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* renamed from: mnf  reason: default package */
/* loaded from: classes2.dex */
public final class mnf implements moi {
    private volatile Set b = null;
    private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public mnf(Collection collection) {
        this.a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mnf b(Collection collection) {
        return new mnf((Set) collection);
    }

    private final synchronized void d() {
        for (moi moiVar : this.a) {
            this.b.add(moiVar.a());
        }
        this.a = null;
    }

    @Override // defpackage.moi
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    public final synchronized void c(moi moiVar) {
        if (this.b == null) {
            this.a.add(moiVar);
        } else {
            this.b.add(moiVar.a());
        }
    }
}
