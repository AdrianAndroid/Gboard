package defpackage;

/* compiled from: PG */
/* renamed from: iqu  reason: default package */
/* loaded from: classes.dex */
public enum iqu implements ido {
    SC_SPELLING_CHECK_REQUEST_GBOARD("SpellChecker.Request.Gboard"),
    SC_SPELLING_CHECK_REQUEST_THIRD_PARTY("SpellChecker.Request.ThirdPartyKeyboard"),
    SC_RULE_BASED_TRIGGER_MODEL("SpellChecker.Trigger.Rule"),
    SC_LANGUAGE_BASED_TRIGGER_MODEL("SpellChecker.Trigger.Language"),
    SC_SUGGESTION_PROPOSED,
    SC_REQUEST_PERFORMANCE("", 50),
    SC_STARTUP_PERFORMANCE,
    SC_SHOW_SUGGESTION,
    SC_SELECT_SUGGESTION,
    SC_REJECT_SUGGESTION,
    SC_IGNORE_SUGGESTION,
    SC_ADD_TO_DICT,
    SC_ADD_TO_DICT_UNDO;
    
    private final String o;
    private final int p;

    iqu() {
        this("");
    }

    @Override // defpackage.idt
    public final int a() {
        return this.p;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.o;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    iqu(String str) {
        this(str, 1000);
    }

    iqu(String str, int i) {
        this.o = str;
        this.p = i;
    }
}
