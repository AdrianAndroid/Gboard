package defpackage;

import android.view.View;
import com.google.android.apps.inputmethod.libs.search.emoji.search.SearchKeyboardEmojiSpecializerM2;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: ecr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ecr implements elh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ecr(SearchKeyboardEmojiSpecializerM2 searchKeyboardEmojiSpecializerM2, int i) {
        this.b = i;
        this.a = searchKeyboardEmojiSpecializerM2;
    }

    public ecr(SearchKeyboard searchKeyboard, int i) {
        this.b = i;
        this.a = searchKeyboard;
    }

    public /* synthetic */ ecr(ecu ecuVar, int i) {
        this.b = i;
        this.a = ecuVar;
    }

    public /* synthetic */ ecr(ecw ecwVar, int i) {
        this.b = i;
        this.a = ecwVar;
    }

    @Override // defpackage.elh
    public final void a() {
        int i = this.b;
        if (i == 0) {
            ecu ecuVar = (ecu) this.a;
            View view = ecuVar.b;
            Objects.requireNonNull(view);
            view.post(new eas(view, 6));
            ecuVar.d();
        } else if (i == 1) {
            SearchKeyboardEmojiSpecializerM2 searchKeyboardEmojiSpecializerM2 = (SearchKeyboardEmojiSpecializerM2) this.a;
            SoftKeyboardView softKeyboardView = searchKeyboardEmojiSpecializerM2.h;
            if (softKeyboardView == null) {
                return;
            }
            softKeyboardView.post(new eas(searchKeyboardEmojiSpecializerM2, 1));
        } else if (i == 2) {
            ecu ecuVar2 = (ecu) this.a;
            ecuVar2.c.setVisibility(8);
            View view2 = ecuVar2.b;
            Objects.requireNonNull(view2);
            view2.post(new eas(view2, 6));
            ede edeVar = (ede) ecuVar2.a;
            edeVar.j();
            Runnable runnable = edeVar.j;
            if (runnable != null) {
                runnable.run();
                edeVar.j = null;
            } else {
                edeVar.g.g(R.string.f151940_resource_name_obfuscated_res_0x7f140249, new Object[0]);
            }
            edeVar.i = null;
            edeVar.f.set(true);
            edeVar.f().hg(edeVar.f().ha() - 1);
        } else if (i != 3) {
            if (i == 4) {
                ecw ecwVar = (ecw) this.a;
                View view3 = ecwVar.b;
                Objects.requireNonNull(view3);
                view3.post(new eas(view3, 7));
                ecwVar.a.e();
                return;
            }
            SoftKeyboardView softKeyboardView2 = ((SearchKeyboard) this.a).h;
            if (softKeyboardView2 == null) {
                return;
            }
            softKeyboardView2.post(new eas(this, 20, null));
        } else {
            ecw ecwVar2 = (ecw) this.a;
            ecwVar2.c.setVisibility(8);
            View view4 = ecwVar2.b;
            Objects.requireNonNull(view4);
            view4.post(new eas(view4, 7));
            ede edeVar2 = (ede) ecwVar2.a;
            edeVar2.p();
            Runnable runnable2 = edeVar2.l;
            if (runnable2 != null) {
                runnable2.run();
                edeVar2.l = null;
            } else {
                edeVar2.g.g(R.string.f151960_resource_name_obfuscated_res_0x7f14024b, new Object[0]);
            }
            edeVar2.k = null;
        }
    }
}
