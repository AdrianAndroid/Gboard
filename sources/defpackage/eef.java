package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;

/* compiled from: PG */
/* renamed from: eef  reason: default package */
/* loaded from: classes.dex */
final class eef implements eku {
    final /* synthetic */ boolean a;
    final /* synthetic */ AbstractSearchResultKeyboard b;
    private final /* synthetic */ int c;

    public eef(GifKeyboardM2 gifKeyboardM2, boolean z, int i) {
        this.c = i;
        this.b = gifKeyboardM2;
        this.a = z;
    }

    public eef(GifKeyboardTablet gifKeyboardTablet, boolean z, int i) {
        this.c = i;
        this.b = gifKeyboardTablet;
        this.a = z;
    }

    @Override // defpackage.eku
    public final void b(String str) {
        String str2 = "UNKNOWN";
        if (this.c != 0) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            if (intent.resolveActivity(((GifKeyboardM2) this.b).u.getPackageManager()) != null) {
                ((GifKeyboardM2) this.b).u.startActivity(intent);
            }
            String K = ((GifKeyboardM2) this.b).K();
            idk idkVar = ((GifKeyboardM2) this.b).b;
            ctd ctdVar = ctd.GIF_IMAGE_OPENED;
            Object[] objArr = new Object[4];
            objArr[0] = K;
            EditorInfo editorInfo = ((GifKeyboardM2) this.b).D;
            if (editorInfo != null) {
                str2 = editorInfo.packageName;
            }
            objArr[1] = str2;
            objArr[2] = str;
            objArr[3] = ((GifKeyboardM2) this.b).c;
            idkVar.e(ctdVar, objArr);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent2.addFlags(268435456);
        if (intent2.resolveActivity(((GifKeyboardTablet) this.b).u.getPackageManager()) != null) {
            ((GifKeyboardTablet) this.b).u.startActivity(intent2);
        }
        String A = ((GifKeyboardTablet) this.b).A();
        idk idkVar2 = ((GifKeyboardTablet) this.b).b;
        ctd ctdVar2 = ctd.GIF_IMAGE_OPENED;
        Object[] objArr2 = new Object[4];
        objArr2[0] = A;
        EditorInfo editorInfo2 = ((GifKeyboardTablet) this.b).D;
        if (editorInfo2 != null) {
            str2 = editorInfo2.packageName;
        }
        objArr2[1] = str2;
        objArr2[2] = str;
        objArr2[3] = ((GifKeyboardTablet) this.b).c;
        idkVar2.e(ctdVar2, objArr2);
    }

    @Override // defpackage.eku
    public final void a(cqp cqpVar, int i) {
        mba mbaVar;
        mba mbaVar2;
        if (this.c != 0) {
            AbstractSearchResultKeyboard abstractSearchResultKeyboard = this.b;
            boolean z = this.a;
            GifKeyboardM2 gifKeyboardM2 = (GifKeyboardM2) abstractSearchResultKeyboard;
            crf crfVar = gifKeyboardM2.d;
            EditorInfo editorInfo = gifKeyboardM2.D;
            if (editorInfo == null) {
                editorInfo = new EditorInfo();
            }
            String U = abstractSearchResultKeyboard.U();
            String K = gifKeyboardM2.K();
            lfb A = gifKeyboardM2.A();
            if (z) {
                mbaVar2 = mba.CONTEXTUAL;
            } else {
                mbaVar2 = A.e() ? ((cnz) A.a()).b : mba.UNKNOWN;
            }
            mba mbaVar3 = mbaVar2;
            gifKeyboardM2.n.q(cqpVar);
            cqz a = cra.a();
            a.b(cqpVar);
            a.c(i);
            a.a = editorInfo;
            a.e(lfb.f(gifKeyboardM2.h));
            a.f(new drf(gifKeyboardM2, 9));
            hiz a2 = crfVar.a(a.a());
            afp afpVar = afp.STARTED;
            boolean z2 = jam.b;
            llk e = llp.e();
            llk e2 = llp.e();
            llk e3 = llp.e();
            e.h(new eee(gifKeyboardM2, cqpVar, U, A, K, mbaVar3, 1));
            a2.E(hjg.a(gyc.b, null, afpVar, z2, e, e2, e3));
            return;
        }
        AbstractSearchResultKeyboard abstractSearchResultKeyboard2 = this.b;
        boolean z3 = this.a;
        GifKeyboardTablet gifKeyboardTablet = (GifKeyboardTablet) abstractSearchResultKeyboard2;
        crf crfVar2 = gifKeyboardTablet.d;
        EditorInfo editorInfo2 = gifKeyboardTablet.D;
        if (editorInfo2 == null) {
            editorInfo2 = new EditorInfo();
        }
        String U2 = abstractSearchResultKeyboard2.U();
        String A2 = gifKeyboardTablet.A();
        lfb u = gifKeyboardTablet.u();
        if (z3) {
            mbaVar = mba.CONTEXTUAL;
        } else {
            mbaVar = u.e() ? ((cnz) u.a()).b : mba.UNKNOWN;
        }
        mba mbaVar4 = mbaVar;
        gifKeyboardTablet.n.q(cqpVar);
        cqz a3 = cra.a();
        a3.b(cqpVar);
        a3.c(i);
        a3.a = editorInfo2;
        a3.e(lfb.f(gifKeyboardTablet.g));
        a3.f(new drf(gifKeyboardTablet, 12));
        hiz a4 = crfVar2.a(a3.a());
        afp afpVar2 = afp.STARTED;
        boolean z4 = jam.b;
        llk e4 = llp.e();
        llk e5 = llp.e();
        llk e6 = llp.e();
        e4.h(new eee(gifKeyboardTablet, cqpVar, U2, u, A2, mbaVar4, 0));
        a4.E(hjg.a(gyc.b, null, afpVar2, z4, e4, e5, e6));
    }
}
