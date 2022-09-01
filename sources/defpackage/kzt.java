package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* renamed from: kzt  reason: default package */
/* loaded from: classes.dex */
final class kzt implements kzw {
    final /* synthetic */ laa a;
    final /* synthetic */ Set b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ kzy d;

    public kzt(kzy kzyVar, laa laaVar, Set set, AtomicBoolean atomicBoolean) {
        this.d = kzyVar;
        this.a = laaVar;
        this.b = set;
        this.c = atomicBoolean;
    }

    @Override // defpackage.kzw
    public final void a(ZipFile zipFile, Set set) {
        this.d.b(this.a, set, new kzs(this));
    }
}
