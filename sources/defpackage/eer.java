package defpackage;

import com.google.android.apps.inputmethod.libs.search.emoji.search.SearchKeyboardEmojiSpecializerM2;
import com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;

/* compiled from: PG */
/* renamed from: eer  reason: default package */
/* loaded from: classes.dex */
public final class eer implements elh {
    final /* synthetic */ String a;
    final /* synthetic */ mba b;
    final /* synthetic */ EditableKeyboard c;
    private final /* synthetic */ int d;

    public /* synthetic */ eer(SearchKeyboardEmojiSpecializerM2 searchKeyboardEmojiSpecializerM2, String str, mba mbaVar, int i) {
        this.d = i;
        this.c = searchKeyboardEmojiSpecializerM2;
        this.a = str;
        this.b = mbaVar;
    }

    public eer(SearchKeyboard searchKeyboard, String str, mba mbaVar, int i) {
        this.d = i;
        this.c = searchKeyboard;
        this.a = str;
        this.b = mbaVar;
    }

    @Override // defpackage.elh
    public final void a() {
        if (this.d == 0) {
            gwv c = eeq.c();
            c.f(this.a);
            c.g(this.b);
            hfd d = hfd.d(c.e().b());
            hsz hszVar = ((SearchKeyboard) this.c).v;
            if (hszVar == null) {
                return;
            }
            hszVar.z(d);
            return;
        }
        EditableKeyboard editableKeyboard = this.c;
        String str = this.a;
        mba mbaVar = this.b;
        gwv c2 = eeq.c();
        c2.f(str);
        c2.g(mbaVar);
        hfd d2 = hfd.d(c2.e().b());
        hsz hszVar2 = ((SearchKeyboardEmojiSpecializerM2) editableKeyboard).v;
        if (hszVar2 == null) {
            return;
        }
        hszVar2.z(d2);
    }
}
