package defpackage;

/* compiled from: PG */
/* renamed from: dja  reason: default package */
/* loaded from: classes.dex */
public enum dja implements ido {
    TEXT_COMMITTED,
    CANDIDATE_SELECTED,
    DEFAULT_CANDIDATE_SELECTED,
    CHARACTERS_INPUTTED,
    ENGINE_PREDICTION_IMPRESSION,
    COMPOSING_ABORTED,
    TEXT_COMPOSING_DELETED,
    TEXT_COMMIT_DELETED,
    TOKEN_CANDIDATE_UNSELECTED,
    EVENT_HANDLED_BY_ENGINE,
    AUTO_CORRECTION_REVERTED,
    DOUBLE_SPACE_TO_INSERT_PERIOD,
    SPACE_INSERTED_AFTER_COMMIT,
    DATA_DICTIONARY_CHANGED,
    DATA_REQUESTED("HmmData.Requested"),
    DATA_LOADED("HmmData.Loaded"),
    DATA_MISSING("HmmData.Missing");
    
    public static final llp r = llp.u("zh_CN", "zh_TW", "zh_HK", "ko");
    private final String t;

    dja() {
        this.t = "";
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.t;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    dja(String str) {
        this.t = str;
    }
}
