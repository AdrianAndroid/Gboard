package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hns  reason: default package */
/* loaded from: classes.dex */
public final class hns extends gqo {
    final /* synthetic */ hnt a;

    public hns(hnt hntVar) {
        this.a = hntVar;
    }

    @Override // defpackage.gqo
    public final void a(boolean z) {
        hnt hntVar = this.a;
        if (!hntVar.d || !hntVar.c) {
            ((ltd) ((ltd) hnt.a.c()).k("com/google/android/libraries/inputmethod/incognito/accesspoint/IncognitoEntryAccessPointProvider", "onAccessPointsClosed", 105, "IncognitoEntryAccessPointProvider.java")).I("onAccessPointsClosed is called when incognitoModeEnabled=%b, accessPointsShowing=%b.", hntVar.d, hntVar.c);
            return;
        }
        hntVar.c = false;
        hntVar.b.a(0);
    }

    @Override // defpackage.gqo
    public final void d(boolean z) {
        hnt hntVar = this.a;
        if (!hntVar.d) {
            ((ltd) ((ltd) hnt.a.c()).k("com/google/android/libraries/inputmethod/incognito/accesspoint/IncognitoEntryAccessPointProvider", "onAccessPointsShown", 94, "IncognitoEntryAccessPointProvider.java")).t("onAccessPointsShown is called when incognito mode is disabled.");
        } else if (hntVar.c) {
        } else {
            hntVar.c = true;
            hntVar.b.a(1);
        }
    }
}
