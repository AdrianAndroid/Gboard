package defpackage;

/* compiled from: PG */
/* renamed from: ich  reason: default package */
/* loaded from: classes.dex */
public enum ich implements ids {
    LOAD_KEYBOARD_DEF_FROM_XML("LoadKeyboardDef.Xml-time"),
    LOAD_KEYBOARD_DEF_FROM_CACHE("LoadKeyboardDef.CacheAll-time"),
    LOAD_KEYBOARD_DEF_FROM_CACHE_FILE("LoadKeyboardDef.CacheFile-time"),
    REQUEST_KEYBOARD_DEF("LoadKeyboardDef.All-time");
    
    private final String f;

    ich(String str) {
        this.f = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.f;
    }
}
