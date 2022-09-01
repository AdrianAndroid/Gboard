package defpackage;

/* compiled from: PG */
/* renamed from: hpb  reason: default package */
/* loaded from: classes.dex */
public enum hpb implements ido {
    IME_ACTIVATED,
    IME_COMPOSING_ABORTED,
    IME_COMPOSING_CLEARED,
    IME_COMPOSING_UPDATED,
    IME_COMPOSING_STOPPED,
    IME_SELECTION_CHANGED,
    IME_TEXT_CANDIDATE_SELECTED,
    IME_TEXT_COMMITTED,
    IME_TEXT_REPLACED,
    KEYBOARD_ACTIVATED,
    READING_TEXT_CANDIDATES_SET,
    TEXT_CANDIDATES_APPENDED,
    TEXT_CANDIDATES_UPDATED;

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final /* synthetic */ String b() {
        return "";
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
