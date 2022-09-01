package defpackage;

/* compiled from: PG */
/* renamed from: hry  reason: default package */
/* loaded from: classes.dex */
public enum hry implements ido {
    INPUT_METHOD_ENTRY_CHANGED,
    LOAD_INPUT_METHOD_ENTRY_ERROR("LoadInputMethodEntry.errors"),
    SWITCH_TO_OTHER_IMES_BY_GLOBE_KEY("Input.Globe.SwitchToOtherImes"),
    UPDATE_MULTILINGUAL_SETTING;
    
    private final String f;

    hry() {
        this.f = "";
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.f;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    hry(String str) {
        this.f = str;
    }
}
