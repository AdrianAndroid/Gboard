package defpackage;

/* compiled from: PG */
/* renamed from: afo  reason: default package */
/* loaded from: classes.dex */
public enum afo {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static afo a(afp afpVar) {
        afp afpVar2 = afp.DESTROYED;
        int ordinal = afpVar.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return ON_STOP;
            }
            if (ordinal == 4) {
                return ON_PAUSE;
            }
            return null;
        }
        return ON_DESTROY;
    }

    public static afo b(afp afpVar) {
        afp afpVar2 = afp.DESTROYED;
        int ordinal = afpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return ON_START;
            }
            if (ordinal == 3) {
                return ON_RESUME;
            }
            return null;
        }
        return ON_CREATE;
    }

    public final afp c() {
        afp afpVar = afp.DESTROYED;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return afp.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return afp.DESTROYED;
                        }
                        new StringBuilder().append(this);
                        throw new IllegalArgumentException(toString().concat(" has no target state"));
                    }
                }
            }
            return afp.STARTED;
        }
        return afp.CREATED;
    }
}
