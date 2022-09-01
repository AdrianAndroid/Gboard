package defpackage;

/* compiled from: PG */
/* renamed from: jag  reason: default package */
/* loaded from: classes.dex */
public final class jag {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/userfeaturecache/register/UserFeatureCacheRegisterHelper");

    public static final boolean a(izq izqVar, Class cls) {
        izq izqVar2 = izq.TEST_FEATURE;
        switch (izqVar.ordinal()) {
            case 0:
                return izx.class.equals(cls);
            case 1:
                return ize.class.equals(cls);
            case 2:
                return izn.class.equals(cls);
            case 3:
                return iyr.class.equals(cls);
            case 4:
                return iyj.class.equals(cls);
            case 5:
                return iyh.class.equals(cls);
            case 6:
                return iyq.class.equals(cls);
            case 7:
                return iyt.class.equals(cls);
            case 8:
                return iys.class.equals(cls);
            case 9:
                return mxi.class.equals(cls);
            case 10:
                return izx.class.equals(cls);
            default:
                throw new IllegalArgumentException("Unknown featureOneofCase.");
        }
    }
}
