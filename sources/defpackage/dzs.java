package defpackage;

import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;

/* compiled from: PG */
/* renamed from: dzs  reason: default package */
/* loaded from: classes.dex */
public final class dzs implements eah {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public dzs(ContentSuggestionKeyboard contentSuggestionKeyboard, dzp dzpVar, int i) {
        this.c = i;
        this.b = contentSuggestionKeyboard;
        this.a = dzpVar;
    }

    public dzs(dzl dzlVar, dzp dzpVar, int i) {
        this.c = i;
        this.a = dzlVar;
        this.b = dzpVar;
    }

    @Override // defpackage.eah
    public final void a(axd axdVar) {
        if (this.c == 0) {
            ((ContentSuggestionKeyboard) this.b).f.b(new dvc(this, axdVar, 8));
        } else {
            ((dzl) this.a).k.b(new dvc(this, axdVar, 5, (byte[]) null));
        }
    }

    @Override // defpackage.eah
    public final void b() {
        if (this.c == 0) {
            ((ContentSuggestionKeyboard) this.b).f.b(new dvc(this, (dzp) this.a, 7));
        } else {
            ((dzl) this.a).k.b(new dvc(this, (dzp) this.b, 4, (byte[]) null));
        }
    }
}
