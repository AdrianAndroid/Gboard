package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: hzc  reason: default package */
/* loaded from: classes.dex */
public final class hzc implements mka {
    final /* synthetic */ String a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public hzc(dbr dbrVar, hta htaVar, ibz ibzVar, Context context, ibr ibrVar, String str, jls jlsVar, int i, byte[] bArr) {
        this.h = i;
        this.e = dbrVar;
        this.c = htaVar;
        this.f = ibzVar;
        this.g = context;
        this.d = ibrVar;
        this.a = str;
        this.b = jlsVar;
    }

    public hzc(hze hzeVar, String str, String str2, hyz hyzVar, hyz hyzVar2, dir dirVar, hiu hiuVar, int i) {
        this.h = i;
        this.f = hzeVar;
        this.b = str;
        this.a = str2;
        this.c = hyzVar;
        this.d = hyzVar2;
        this.g = dirVar;
        this.e = hiuVar;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [hta, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        if (this.h != 0) {
            dbr dbrVar = (dbr) this.e;
            ((ltd) ((ltd) dbr.b.a(hip.a).i(th)).k("com/google/android/apps/inputmethod/libs/extension/KeyboardFactory$1", "onFailure", 186, "KeyboardFactory.java")).z("failed to parse keyboard group def : %d -> %s. ", dbrVar.e, dbrVar.c.getResources().getResourceEntryName(((dbr) this.e).e));
            ?? r8 = this.c;
            if (r8 == 0) {
                return;
            }
            r8.a((ibz) this.f, null, null);
            return;
        }
        ((ltd) ((ltd) ((ltd) hze.a.c()).i(th)).k("com/google/android/libraries/inputmethod/mdd/FlaggedDownloadManager$1", "onFailure", (char) 153, "FlaggedDownloadManager.java")).s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [hta, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [hta, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ibr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [hiu, java.lang.Object] */
    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        if (this.h == 0) {
            ngz ngzVar = (ngz) obj;
            synchronized (this.f) {
                if (((hze) this.f).b.contains(this.b)) {
                    ((ltd) ((ltd) hze.a.d()).k("com/google/android/libraries/inputmethod/mdd/FlaggedDownloadManager$1", "onSuccess", 136, "FlaggedDownloadManager.java")).w("flag %s is already created", this.b);
                    return;
                }
                hic k = hhq.k((String) this.b, ngzVar);
                Object obj2 = this.f;
                String str = this.a;
                Object obj3 = this.c;
                Object obj4 = this.d;
                hyz hyzVar = (hyz) obj4;
                hyz hyzVar2 = (hyz) obj3;
                hze hzeVar = (hze) obj2;
                hzeVar.e(k, null, str, hyzVar2, hyzVar, (dir) this.g, this.e);
                return;
            }
        }
        ibw ibwVar = (ibw) obj;
        if (ibwVar == null) {
            ((ltd) ((ltd) dbr.b.c()).k("com/google/android/apps/inputmethod/libs/extension/KeyboardFactory$1", "onSuccess", 156, "KeyboardFactory.java")).t("Keyboard Group def is null");
            ?? r0 = this.c;
            if (r0 == 0) {
                return;
            }
            r0.a((ibz) this.f, null, null);
        } else if (!ibwVar.c((ibz) this.f)) {
            ((luc) ((luc) dbr.a.c()).k("com/google/android/apps/inputmethod/libs/extension/KeyboardFactory$1", "onSuccess", 163, "KeyboardFactory.java")).w("keyboardtype %s is not supported by this provider", this.f);
            ?? r02 = this.c;
            if (r02 == 0) {
                return;
            }
            r02.a((ibz) this.f, null, null);
        } else {
            ibu a = ibu.a(((dbr) this.e).c);
            Object obj5 = this.g;
            Context context = (Context) obj5;
            a.c(context, this.d, gvv.c(context), this.a, (jls) this.b, ibwVar, (ibz) this.f);
        }
    }
}
