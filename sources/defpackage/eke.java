package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;

/* compiled from: PG */
/* renamed from: eke  reason: default package */
/* loaded from: classes.dex */
public final class eke implements eku {
    final /* synthetic */ AbstractSearchResultKeyboard a;
    private final /* synthetic */ int b;

    public eke(UniversalMediaKeyboardM2 universalMediaKeyboardM2, int i) {
        this.b = i;
        this.a = universalMediaKeyboardM2;
    }

    public eke(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, int i) {
        this.b = i;
        this.a = universalMediaKeyboardTablet;
    }

    @Override // defpackage.eku
    public final void b(String str) {
        if (this.b != 0) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            if (intent.resolveActivity(((UniversalMediaKeyboardM2) this.a).u.getPackageManager()) == null) {
                ((ltd) ((ltd) UniversalMediaKeyboardM2.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2$1", "onOpenLink", 228, "UniversalMediaKeyboardM2.java")).t("No browser has been installed to open the image source");
            } else {
                ((UniversalMediaKeyboardM2) this.a).u.startActivity(intent);
            }
            AbstractSearchResultKeyboard abstractSearchResultKeyboard = this.a;
            UniversalMediaKeyboardM2 universalMediaKeyboardM2 = (UniversalMediaKeyboardM2) abstractSearchResultKeyboard;
            universalMediaKeyboardM2.e.e(ctd.UNIVERSAL_MEDIA_IMAGE_OPENED, universalMediaKeyboardM2.h, str, abstractSearchResultKeyboard.U(), UniversalMediaKeyboardM2.T(), universalMediaKeyboardM2.u());
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent2.addFlags(268435456);
        if (intent2.resolveActivity(((UniversalMediaKeyboardTablet) this.a).u.getPackageManager()) == null) {
            ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet$1", "onOpenLink", 226, "UniversalMediaKeyboardTablet.java")).t("No browser has been installed to open the image source");
        } else {
            ((UniversalMediaKeyboardTablet) this.a).u.startActivity(intent2);
        }
        AbstractSearchResultKeyboard abstractSearchResultKeyboard2 = this.a;
        UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) abstractSearchResultKeyboard2;
        universalMediaKeyboardTablet.e.e(ctd.UNIVERSAL_MEDIA_IMAGE_OPENED, universalMediaKeyboardTablet.h, str, abstractSearchResultKeyboard2.U(), UniversalMediaKeyboardTablet.V(), universalMediaKeyboardTablet.u());
    }

    @Override // defpackage.eku
    public final void a(cqp cqpVar, int i) {
        if (this.b == 0) {
            AbstractSearchResultKeyboard abstractSearchResultKeyboard = this.a;
            UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) abstractSearchResultKeyboard;
            crf crfVar = universalMediaKeyboardTablet.d;
            EditorInfo editorInfo = universalMediaKeyboardTablet.D;
            if (editorInfo == null) {
                editorInfo = new EditorInfo();
            }
            String U = abstractSearchResultKeyboard.U();
            universalMediaKeyboardTablet.r.q(cqpVar);
            cqz a = cra.a();
            a.b(cqpVar);
            a.c(i);
            a.a = editorInfo;
            a.e(cri.c(universalMediaKeyboardTablet.u, cqpVar));
            a.f(new drf(universalMediaKeyboardTablet, 18));
            hiz a2 = crfVar.a(a.a());
            afp afpVar = afp.STARTED;
            boolean z = jam.b;
            llk e = llp.e();
            llk e2 = llp.e();
            llk e3 = llp.e();
            e.h(new dzw(universalMediaKeyboardTablet, cqpVar, U, 4));
            a2.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
            return;
        }
        AbstractSearchResultKeyboard abstractSearchResultKeyboard2 = this.a;
        UniversalMediaKeyboardM2 universalMediaKeyboardM2 = (UniversalMediaKeyboardM2) abstractSearchResultKeyboard2;
        crf crfVar2 = universalMediaKeyboardM2.d;
        EditorInfo editorInfo2 = universalMediaKeyboardM2.D;
        if (editorInfo2 == null) {
            editorInfo2 = new EditorInfo();
        }
        String U2 = abstractSearchResultKeyboard2.U();
        universalMediaKeyboardM2.n.q(cqpVar);
        cqz a3 = cra.a();
        a3.b(cqpVar);
        a3.c(i);
        a3.a = editorInfo2;
        a3.e(cri.c(universalMediaKeyboardM2.u, cqpVar));
        a3.f(new drf(universalMediaKeyboardM2, 17));
        hiz a4 = crfVar2.a(a3.a());
        afp afpVar2 = afp.STARTED;
        boolean z2 = jam.b;
        llk e4 = llp.e();
        llk e5 = llp.e();
        llk e6 = llp.e();
        e4.h(new dzw(universalMediaKeyboardM2, cqpVar, U2, 3));
        a4.E(hjg.a(gyc.b, null, afpVar2, z2, e4, e5, e6));
    }
}
