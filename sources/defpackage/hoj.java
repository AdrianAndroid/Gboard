package defpackage;

/* compiled from: PG */
/* renamed from: hoj  reason: default package */
/* loaded from: classes.dex */
public enum hoj implements ido {
    INLINE_SUGGESTION_SELECTED("InlineSuggestion.CandidateSelected"),
    SEND_SWIPE_ON_SPACE("InlineSuggestion.SendSwipe"),
    APP_SMART_COMPOSE("InlineSuggestion.ASC");
    
    public final String d;

    hoj(String str) {
        this.d = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.d;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
