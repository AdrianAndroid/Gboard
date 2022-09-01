package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: hzy  reason: default package */
/* loaded from: classes.dex */
public final class hzy extends hzu {
    private final Class c;

    public hzy(Class cls) {
        super(null);
        this.c = cls;
    }

    @Override // defpackage.hzu
    protected final /* bridge */ /* synthetic */ Object a(Context context, String str, lfy lfyVar) {
        Enum a = jak.a(str, this.c);
        if (a == null) {
            ((luc) iag.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/AbstractTemplateBuilder$EnumAttributeWrapper", "stringToValue", 385, "AbstractTemplateBuilder.java")).w("Invalid enum attribute: %s", str);
        }
        return a;
    }

    public hzy(Enum r2) {
        super(r2);
        if (r2 == null) {
            throw new NullPointerException("Default value cannot be null.");
        }
        this.c = r2.getDeclaringClass();
    }
}
