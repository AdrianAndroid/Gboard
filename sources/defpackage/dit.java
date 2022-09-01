package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dit  reason: default package */
/* loaded from: classes.dex */
public final class dit implements mka {
    final /* synthetic */ diu a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ div e;

    public dit(div divVar, diu diuVar, String str, String str2, boolean z) {
        this.e = divVar;
        this.a = diuVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) div.b.c()).i(th)).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator$2", "onFailure", (char) 195, "HmmDataFacilitator.java")).t("Error getting downloaded packs");
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.e.k((byy) obj);
        this.e.j(this.a, this.b, this.c, this.d);
    }
}
