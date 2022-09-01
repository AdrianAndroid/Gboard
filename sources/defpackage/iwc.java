package defpackage;

/* compiled from: PG */
/* renamed from: iwc  reason: default package */
/* loaded from: classes.dex */
public enum iwc implements ido {
    IME_ACTIVATE_METADATA,
    KEYBOARD_LAYOUT,
    INPUT_ACTION,
    KEYBOARD_RUNTIME_PARAMS,
    KEYBOARD_DECODER_PARAMS,
    DECODER_EXPERIMENT_PARAMS,
    LOADED_MAIN_LMS,
    PRE_TRAINING_CACHE_SESSION_END,
    CLEARCUT_LOG_EVENT,
    MATERIALIZER_START("TC.Mater.Start"),
    MATERIALIZER_TF_EXAMPLE("TC.Mater.TfExample"),
    ESS_START("TC.ESS.Start"),
    MAINTENANCE_TASK_INTERVAL_HOURS,
    MAINTENANCE_TASK_RESULT("TC.Maint.Res"),
    MAINTENANCE_FAIL_SAFE_COUNT,
    TABLE_STATS,
    DB_SIZE,
    INPUT_METRICS,
    CHECK_INPUT_ACTIONS_RESULT("TC.Storage.Check"),
    DEVICE_INTEGRITY_CHECK("TC.Device.Integrity"),
    INPUT_ACTION_SOURCE("TC.NM.IAS"),
    GET_LATEST_UNIFIED_PARAMS_RESULT("TC.NM.GLUP.Res"),
    FETCH_LM_RESULT("TC.NM.FLM.Res"),
    LC_ARTIFACTS_EXTRACTED("LC.Art.Extracted"),
    LC_TRAINER_SCHEDULED("LC.Trainer.Schedule"),
    LC_TRAINER_CANCELED("LC.Trainer.Cancel"),
    LC_TASK_SUCCESS("LC.Task.Success"),
    LC_TASK_FAILURE("LC.Task.Failure"),
    LC_HANDLER_IMPL("LC.Handler.Impl"),
    LC_HANDLER_IMPL_RESULT,
    LC_HANDLER_IMPL_BEAM_SIZE("LC.Handler.Impl.param_sweep_handler.BeamSize");
    
    private final String G;

    iwc() {
        this.G = "";
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.G;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    iwc(String str) {
        this.G = str;
    }
}
