package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.extension.ContentSuggestionExtension;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: ejr  reason: default package */
/* loaded from: classes.dex */
public final class ejr implements mka {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/universalmedia/RecentStickerListener");
    private final Context b;
    private final ejt c;
    private final cri d;
    private final cri e;
    private final cri f;

    public ejr(Context context, ejt ejtVar, cri criVar, cri criVar2, cri criVar3) {
        this.b = context;
        this.c = ejtVar;
        this.d = criVar;
        this.e = criVar2;
        this.f = criVar3;
    }

    private static llp c(cxc cxcVar) {
        if (cxcVar == null) {
            return llp.q();
        }
        return llp.o(lre.H(cxcVar.g, ehk.s));
    }

    private final void d(llp llpVar) {
        llk e = llp.e();
        cuz cuzVar = cuz.a;
        Context context = this.b;
        if (cuz.f(context, ContentSuggestionExtension.class) && ino.M(context).aj(R.string.f160760_resource_name_obfuscated_res_0x7f14066c)) {
            e.j(this.d.e());
        }
        e.j(this.e.e());
        e.j(this.f.e());
        e.j(llpVar);
        this.c.a(e.g());
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/search/universalmedia/RecentStickerListener", "onFailure", 'P', "RecentStickerListener.java")).t("Failed to get results");
        if (th instanceof CancellationException) {
            return;
        }
        d(llp.q());
    }

    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        cxc cxcVar = null;
        cxc cxcVar2 = null;
        for (cxc cxcVar3 : (List) obj) {
            if (cxcVar == null && cxcVar3.i == 1) {
                cxcVar = cxcVar3;
            } else if (cxcVar2 == null && cxcVar3.i == 2) {
                cxcVar2 = cxcVar3;
            }
            if (cxcVar != null && cxcVar2 != null) {
                break;
            }
        }
        llk e = llp.e();
        e.j(c(cxcVar2));
        e.j(c(cxcVar));
        d(e.g());
    }
}
