package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* renamed from: kzu  reason: default package */
/* loaded from: classes.dex */
final class kzu implements kzw {
    final /* synthetic */ Set a;
    final /* synthetic */ laa b;
    final /* synthetic */ kzy c;

    public kzu(kzy kzyVar, Set set, laa laaVar) {
        this.c = kzyVar;
        this.a = set;
        this.b = laaVar;
    }

    @Override // defpackage.kzw
    public final void a(ZipFile zipFile, Set set) {
        Set set2 = this.a;
        kzy kzyVar = this.c;
        laa laaVar = this.b;
        HashSet hashSet = new HashSet();
        kzyVar.b(laaVar, set, new kzv(hashSet, laaVar, zipFile));
        set2.addAll(hashSet);
    }
}
